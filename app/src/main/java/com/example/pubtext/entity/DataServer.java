package com.example.pubtext.entity;



import java.util.ArrayList;
import java.util.List;

/**
 * https://github.com/CymChad/BaseRecyclerViewAdapterHelper
 */
public class DataServer {

    public static final String HTTPS_AVATARS1_GITHUBUSERCONTENT_COM_LINK = "https://avatars1.githubusercontent.com/u/7698209?v=3&s=460";
    public static final String CYM_CHAD = "CymChad";
    public static final String CHAY_CHAN = "ChayChan";

    private DataServer() {
    }

    public static List<Status> getSampleData(int lenth) {
        List<Status> list = new ArrayList<>();
        for (int i = 0; i < lenth; i++) {
            Status status = new Status();
            status.setTaskname("Chad" + i);
            status.setTaskdate("04/05/" + i);
            status.setTaskadress("aaa");

            list.add(status);
        }
        return list;
    }

    public static List<TaskInfo> getSampleData2(int lenth) {
        List<TaskInfo> list = new ArrayList<>();
        for (int i = 0; i < lenth; i++) {
            TaskInfo taskInfo = new TaskInfo();
            taskInfo.setTaskid( i);
            taskInfo.setTaskname("Chad" + i);
            taskInfo.setTaskdate("04/05/" + i);
            taskInfo.setTaskadress("aaa");

            list.add(taskInfo);
        }
        return list;
    }


    public static List<Status> addData(List list, int dataSize) {
        for (int i = 0; i < dataSize; i++) {
            Status status = new Status();
            status.setTaskname("Chad" + i);
            status.setTaskdate("04/05/" + i);
            status.setTaskadress("aaa");

            list.add(status);
        }

        return list;
    }

//    public static List<MySection> getSampleData() {
//        List<MySection> list = new ArrayList<>();
//        list.add(new MySection(true, "Section 1", true));
//        list.add(new MySection(new Video(HTTPS_AVATARS1_GITHUBUSERCONTENT_COM_LINK, CYM_CHAD)));
//        list.add(new MySection(new Video(HTTPS_AVATARS1_GITHUBUSERCONTENT_COM_LINK, CYM_CHAD)));
//        list.add(new MySection(new Video(HTTPS_AVATARS1_GITHUBUSERCONTENT_COM_LINK, CYM_CHAD)));
//        list.add(new MySection(new Video(HTTPS_AVATARS1_GITHUBUSERCONTENT_COM_LINK, CYM_CHAD)));
//        list.add(new MySection(true, "Section 2", false));
//        list.add(new MySection(new Video(HTTPS_AVATARS1_GITHUBUSERCONTENT_COM_LINK, CYM_CHAD)));
//        list.add(new MySection(new Video(HTTPS_AVATARS1_GITHUBUSERCONTENT_COM_LINK, CYM_CHAD)));
//        list.add(new MySection(new Video(HTTPS_AVATARS1_GITHUBUSERCONTENT_COM_LINK, CYM_CHAD)));
//        list.add(new MySection(true, "Section 3", false));
//        list.add(new MySection(new Video(HTTPS_AVATARS1_GITHUBUSERCONTENT_COM_LINK, CYM_CHAD)));
//        list.add(new MySection(new Video(HTTPS_AVATARS1_GITHUBUSERCONTENT_COM_LINK, CYM_CHAD)));
//        list.add(new MySection(true, "Section 4", false));
//        list.add(new MySection(new Video(HTTPS_AVATARS1_GITHUBUSERCONTENT_COM_LINK, CYM_CHAD)));
//        list.add(new MySection(new Video(HTTPS_AVATARS1_GITHUBUSERCONTENT_COM_LINK, CYM_CHAD)));
//        list.add(new MySection(true, "Section 5", false));
//        list.add(new MySection(new Video(HTTPS_AVATARS1_GITHUBUSERCONTENT_COM_LINK, CYM_CHAD)));
//        list.add(new MySection(new Video(HTTPS_AVATARS1_GITHUBUSERCONTENT_COM_LINK, CYM_CHAD)));
//        return list;
//    }

//    public static List<SectionMultipleItem> getSectionMultiData() {
//        List<SectionMultipleItem> list = new ArrayList<>();
//        Video video = new Video(HTTPS_AVATARS1_GITHUBUSERCONTENT_COM_LINK, CYM_CHAD);
//
//        // add section data
//        list.add(new SectionMultipleItem(true, "Section 1", true));
//        // add multiple type item data ---start---
//        list.add(new SectionMultipleItem(SectionMultipleItem.TEXT, new Video(HTTPS_AVATARS1_GITHUBUSERCONTENT_COM_LINK, "video_id_0")));
//        list.add(new SectionMultipleItem(SectionMultipleItem.TEXT, new Video(HTTPS_AVATARS1_GITHUBUSERCONTENT_COM_LINK, "video_id_1")));
//        list.add(new SectionMultipleItem(SectionMultipleItem.IMG_TEXT, new Video(HTTPS_AVATARS1_GITHUBUSERCONTENT_COM_LINK, "video_id_2")));
//        // ---end---
//
//        list.add(new SectionMultipleItem(true, "Section 2", false));
//        list.add(new SectionMultipleItem(SectionMultipleItem.IMG_TEXT, video));
//        list.add(new SectionMultipleItem(SectionMultipleItem.IMG_TEXT, video));
//        list.add(new SectionMultipleItem(SectionMultipleItem.TEXT, video));
//        list.add(new SectionMultipleItem(SectionMultipleItem.TEXT, video));
//        list.add(new SectionMultipleItem(true, "Section 3", false));
//        list.add(new SectionMultipleItem(SectionMultipleItem.IMG_TEXT, video));
//        list.add(new SectionMultipleItem(true, "Section 4", false));
//        list.add(new SectionMultipleItem(SectionMultipleItem.TEXT, video));
//        list.add(new SectionMultipleItem(true, "Section 5", false));
//        list.add(new SectionMultipleItem(SectionMultipleItem.IMG_TEXT, video));
//        list.add(new SectionMultipleItem(SectionMultipleItem.IMG_TEXT, video));
//        list.add(new SectionMultipleItem(SectionMultipleItem.IMG_TEXT, video));
//        return list;
//    }



//
//    public static List<NormalMultipleEntity> getNormalMultipleEntities() {
//        List<NormalMultipleEntity> list = new ArrayList<>();
//        for (int i = 0; i <= 4; i++) {
//            list.add(new NormalMultipleEntity(NormalMultipleEntity.SINGLE_IMG));
//            list.add(new NormalMultipleEntity(NormalMultipleEntity.SINGLE_TEXT,CHAY_CHAN));
//            list.add(new NormalMultipleEntity(NormalMultipleEntity.TEXT_IMG,CHAY_CHAN));
//            list.add(new NormalMultipleEntity(NormalMultipleEntity.TEXT_IMG,CYM_CHAD));
//            list.add(new NormalMultipleEntity(NormalMultipleEntity.TEXT_IMG,CHAY_CHAN));
//        }
//        return list;
//    }
//

    }

