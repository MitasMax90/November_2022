package Module_4;

class Rect {
    private int s;
    int w, h;
    Rect(int w, int h){
        this.w = w;
        this.h = h;
        s = w * h;
    }
    int getS(){
        return s;
    }
    int getW(){
        return w;
    }
    int getH(){
        return h;
    }

    public static void main(String[] args) {
        Rect rectan = new Rect(20,30);
        rectan.w = 1;
//        rectan.getW() * rectan.getH() == rectan.getS();

    }
}

