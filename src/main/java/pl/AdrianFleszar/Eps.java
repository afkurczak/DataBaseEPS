package pl.AdrianFleszar;

class Eps {
    int partsId;
    int projectNumber;
    String projectName;
    String partsStatus;


    Eps (int partsId, int projectNumber, String projectName, String partsStatus){
        this.partsId = partsId;
        this.projectNumber = projectNumber;
        this.projectName = projectName;
        this.partsStatus = partsStatus;
    }
    @Override
    public String toString() {
        return "Part(" +
                "" + partsId +
                " " + projectNumber +
                " " + projectName +
                " " + partsStatus +
                ")";
    }
}
