package model;

import java.util.ArrayList;
import java.util.List;

public class Branch {

    private final Printer printer = new Printer();
    private String data;
    private Branch parent;
    private List<Branch> children;

    public Branch(String data, Branch parent) {
        this.data = data;
        this.parent = parent;
    }

    public String getData() {
        return data;
    }

    public Branch getParent() {
        return parent;
    }

    public List<Branch> getChildren() {
        return children;
    }

    public void setChildren(List<Branch> children) {
        this.children = children;
    }

    public List<String> returnParentData() {
        Branch branch = this;
        List<String> list = new ArrayList<>();
        while (branch.getParent() != null) {
            list.add(branch.getData());
            branch = branch.getParent();
            if (branch.getParent() == null) {
                list.add(branch.getData());
            }
        }
        return list;
    }

    public void print() {
        printer.printing("", true);
    }

    private class Printer {

        private void printing(String prefix, boolean isTail) {
            System.out.println(prefix + (isTail ? "└── " : "├── ") + data);
            for (int i = 0; i < children.size() - 1; i++) {
                children.get(i).printer.printing(prefix + (isTail ? "    " : "│   "), false);
            }
            if (children.size() > 0) {
                children.get(children.size() - 1).printer.printing(
                    prefix + (isTail ? "    " : "│   "), true);
            }
        }
    }

}
