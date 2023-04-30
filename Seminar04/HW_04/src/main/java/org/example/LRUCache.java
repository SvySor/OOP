package org.example;

import java.util.List;

public class LRUCache {
    private List<Employee> employees;
    private Integer size;

    public LRUCache(Integer size) {
        this.size = size;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Employee getEmployee(Integer position){
        if (position < employees.size()) {
            return employees.get(position);
        }
        throw new IllegalArgumentException("Индекс вышел за размеры кэша");
    }

    public List<Employee> getAllElements() {
        return employees;
    }

    public void addElement(Employee addedEmployee){
        employees.add(addedEmployee);
        if (employees.size() > size){
            employees.remove(0);
        }
    }
}
