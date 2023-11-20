package interface_adapter.OpenNote_adapter;

import use_case.OpenNote_case.OpenNoteInputBoundary;
import use_case.OpenNote_case.OpenNoteInputData;

public class OpenNoteController {
    final OpenNoteInputBoundary openNoteUseCaseInteractor;
    public OpenNoteController(use_case.OpenNote_case.OpenNoteInputBoundary openNoteUseCaseInteractor) {
        this.openNoteUseCaseInteractor = openNoteUseCaseInteractor;
    }


    public void openNote(String title) {
        //TODO: call note from api
    }

    public void newNote(String title,String content) {
        OpenNoteInputData openNoteInputData = new OpenNoteInputData(title,content);
        openNoteUseCaseInteractor.createNote(openNoteInputData);
    }
}
