/**
 * Created by artemkopytok on 02.06.16.
 */
public class Task {

    Integer taskId;

    Feathure feathureFromBL; //Фича с беклога
    Priority taskPriority;
    String targetsName;
    String targetsDescription;//Цель для выполнения задачи
    User executor;// Исполнитель
    String toDo;
    Stage stageStatus;

    Integer iterationsSize;
    Integer startDay;
    Integer finishDay;


}
