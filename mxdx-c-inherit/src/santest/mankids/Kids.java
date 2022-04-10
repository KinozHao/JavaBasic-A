package santest.mankids;

/**
 * @author kinoz
 * @date 2022/4/4 - 14:45
 * @apiNote
 */
class Kids extends ManKind{
    private int yearsOld;

    public int getYearsOld() {
        return yearsOld;
    }

    public void setYearsOld(int yearsOld) {
        this.yearsOld = yearsOld;
    }

    public Kids() {

    }

    public Kids(int yearsOld) {
        this.yearsOld = yearsOld;
    }

    public void printAge(){
        System.out.println("ÄêÁä:"+yearsOld);
    }

    @Override
    public void employed() {
        System.out.println("kids should study not job");
    }
}
