package model;

import java.util.ArrayList;
import java.util.List;

public class Branch {

    private String data;
    private Branch parent;
    private List<Branch> children;

    public Branch(String data) {
        this.data = data;
    }

    public Branch(String data, Branch parent) {
        this.data = data;
        this.parent = parent;
    }

    public Branch(String data, Branch parent, List<Branch> children) {
        this.data = data;
        this.parent = parent;
        this.children = children;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Branch getParent() {
        return parent;
    }

    public void setParent(Branch parent) {
        this.parent = parent;
    }

    public List<Branch> getChildren() {
        return children;
    }

    public void setChildren(List<Branch> children) {
        this.children = children;
    }

    public List<String> returnParentData() {
        Branch node = this;
        List<String> list = new ArrayList<>();
        while (node.getParent() != null) {
            list.add(node.getData());
            node = node.getParent();
            if (node.getParent() == null) {
                list.add(node.getData());
            }
        }
        return list;
    }

}
