package com;

import java.util.List;

public class MyOuterClass {
    private String name;

    public String getName(){
        return name;
    }

    public void reorderStatus(List<Status> statusList){
        Status status = new Status(1, 1);
        status.getId();


//        status = Status.of(1, 1);
    }

    public class Status {
        private int id;
        private int order;

        public Status(int id, int order) {
            this.id = id;
            this.order = order;
        }

        public int getId() {
//            System.out.println(name);
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getOrder() {
            return order;
        }

        public void setOrder(int order) {
            this.order = order;
        }

//        public static Status of(int id, int order) {
//            return new Status (id, order);
//        }
    }
}
