package cn.edu.ncu.newmedia.dao;

import cn.edu.ncu.newmedia.bean.Recruit;

public class Test {
    public static void main(String []args) throws Exception {
        RecruitDao recruitDao = new RecruitDao();
        Recruit recruit = new Recruit();
        recruit = recruitDao.get_one(1, 4);
        int total = recruitDao.gettotal(4);
        System.out.println(total);
        String recruitStr = "\"recruit" +  "\"" + ":" + "[" ;
        recruitStr += "{" + "\"id"+"\""+":"+"\""+ recruit.getId()+"\"," + "\"studentId"+"\""+":"+"\""+recruit.getStudentId()+"\","+ "\"communityId"+"\""+":"+"\""+recruit.getCommunityId()+"\"," + "\"name"+"\""+":"+"\""+recruit.getName()+"\"," + "\"sex"+"\""+":"+"\""+recruit.getSex()+"\"," + "\"nation"+"\""+":"+"\""+recruit.getNation()+"\"," + "\"birthday"+"\""+":"+"\""+ recruit.getBirthday() +"\"," + "\"nativePlace"+"\""+":"+"\""+ recruit.getNativePlace() +"\"," + "\"politicalAffiliation"+"\""+":"+"\""+ recruit.getPoliticalAffiliation() +"\","  + "\"college"+"\""+":"+"\""+ recruit.getCollege() +"\"," + "\"major"+"\""+":"+"\""+ recruit.getMajor() +"\"," + "\"phone"+"\""+":"+"\""+ recruit.getPhone() +"\"," + "\"department1"+"\""+":"+"\""+ recruit.getDepartment1() +"\"," + "\"department2"+"\""+":"+"\""+ recruit.getDepartment2() +"\"," + "\"department3"+"\""+":"+"\""+ recruit.getDepartment3() +"\"," + "\"speciality"+"\""+":"+"\""+ recruit.getSpeciality() +"\"," + "\"experience"+"\""+":"+"\""+ recruit.getExperience() +"\"," + "\"timesId"+"\""+":"+"\""+ recruit.getTimesId() +"\"," + "\"messageState"+"\""+":"+"\""+ recruit.getMessageState() +"\"," + "\"createAt"+"\""+":"+"\""+ recruit.getCreateAt() +"\"," + "\"state"+"\""+":"+"\""+ recruit.getState() +"\"" + "}," ;
        recruitStr = "{"+recruitStr.substring(0, recruitStr.length()-1)+"]}" ;
        System.out.println(recruitStr);
    }
}
