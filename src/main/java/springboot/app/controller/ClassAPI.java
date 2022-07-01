package springboot.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import springboot.app.controller.output.OutputClass;
import springboot.app.service.IClassService;

@CrossOrigin
@RestController
public class ClassAPI {
    @Autowired
	private IClassService classService;
    
    @GetMapping(value = "/class")
    public OutputClass showAllClass(@RequestParam(value = "page",required = true) Integer page,
                                    @RequestParam(value = "limit",required = true) Integer limit){
        OutputClass result = new OutputClass();
			result.setPage(page);
			Pageable pageable = PageRequest.of(page - 1 ,limit);
			result.setListResult(classService.findAll(pageable));
			result.setTotalPage((int) Math.ceil((double) (classService.totalItem()) / limit));
		return result;
    }
}
