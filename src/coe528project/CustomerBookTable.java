package coe528project;

public class CustomerBookTable {
        private String name;
        private int price;
        private boolean select;
        
        public CustomerBookTable(String name, int price, boolean select) {
            this.name = name;
            this.price = price;
            this.select = false;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

    public boolean isSelect() {
        return select;
    }

    public void setSelect(boolean select) {
        this.select = select;
    }

}