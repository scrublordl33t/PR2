class Test{
    public static void main(String[] args){

        Rettangolo r = new Rettangolo(30,10);
        r.setAltezza(-10);
        int area = r.area();
        System.out.println(area);
    }
}

