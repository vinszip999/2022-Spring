package polymorphism;

public class 어쩔TV implements TV {
    @Override
    public void powerOn(){
        System.out.println("어쩔티비 ---- 전원 켠다.");
    }
    @Override
    public void powerOff(){
        System.out.println("어쩔티비 ---- 전원 끈다.");
    }
    @Override
    public void volumeUp(){
        System.out.println("어쩔티비 ---- 소리를 올린다.");
    }
    @Override
    public void volumeDown(){
        System.out.println("어쩔티비 ---- 소리를 내린다.");
    }

}
