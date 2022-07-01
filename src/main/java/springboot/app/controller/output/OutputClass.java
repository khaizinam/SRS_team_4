package springboot.app.controller.output;

import java.util.ArrayList;
import java.util.List;

import springboot.app.model.dto.ClassDTO;

public class OutputClass {
    private int page;
    private int totalPage;
    private List<ClassDTO> listResult = new ArrayList<>();

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public List<ClassDTO> getListResult() {
        return listResult;
    }

    public void setListResult(List<ClassDTO> listResult) {
        this.listResult = listResult;
    }

}
