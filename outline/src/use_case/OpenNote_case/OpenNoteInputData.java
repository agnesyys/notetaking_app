package use_case.OpenNote_case;

public class OpenNoteInputData {
    private String title;
    private String content;

    public OpenNoteInputData(String title, String content){
        this.title = title;
        this.content = content;
    }

    public String getTitle(){
        return title;
    }

    public String getContent(){
        return content;
    }
    //TODO: change this below
    public String callFile(){}
}

