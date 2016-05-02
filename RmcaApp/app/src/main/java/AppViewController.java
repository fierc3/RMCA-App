import android.view.MotionEvent;

/**
 * Created by E56-25 on 02.05.2016.
 */
public class AppViewController {
    public void processCommand(MotionEvent event, CommandType cType)
    {
        switch(event.getAction())
        {
            case MotionEvent.ACTION_UP:
                //Placeholder
                break;
            case MotionEvent.ACTION_DOWN:
                //Placeholder
                executeMoveType(cType);
                break;


        }
    }

    private void executeMoveType(CommandType commandType) {
        switch(commandType)
        {
            case STOP:
                //Placeholder
                break;
            case FORWARD:
                //Placeholder
                break;
            case BACKWARD:
                //Placeholder
                break;
            case LEFT:
                //Placeholder
                break;
            case RIGHT:
                //Placeholder
                break;

        }

    }
}
