public class All {
    private String AD,AP,HP,MP;
    public All(String AD1,String AP1,String HP1,String MP1){
        this.setAD(AD1);
        this.setAP(AP1);
        this.setHP(HP1);
        this.setMP(MP1);
    }
    public void setAD(String ADStr){
        if (ADStr.length()<=3){
            this.AD=ADStr;
        }else {
            System.out.println("超過最高上限，將多於部分刪除");
            this.AD=ADStr.substring(0,3);
        }
    }
    public void setAP(String APStr){
        if (APStr.length()<=3){
            this.AP=APStr;
        }else {
            System.out.println("超過最高上限，將多於部分刪除");
            this.AP=APStr.substring(0,3);
        }
    }
    public void setHP(String HPStr){
        if (HPStr.length()<=3){
            this.HP=HPStr;
        }else {
            System.out.println("超過最高上限，將多於部分刪除");
            this.HP=HPStr.substring(0,4);
        }
    }
    public void setMP(String MPStr){
        if (MPStr.length()<=3){
            this.MP=MPStr;
        }else {
            System.out.println("超過最高上限，將多於部分刪除");
            this.MP=MPStr.substring(0,4);
        }
    }
}
