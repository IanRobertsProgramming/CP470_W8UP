package wilfridlaurier.ianroberts.cp470_w8up;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class WorkoutsActivity extends AppCompatActivity {

    SearchView workoutsSearchView;
    ImageButton newWorkoutButton;
    ImageButton filterWorkoutsButton;
    ListView workoutsListView;
    ArrayAdapter adapter;
    // TODO update this to be a list of workout objects?
    //ArrayList<String> list1;
    ArrayList<Workout> userWorkouts;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workouts);
        workoutsSearchView = findViewById(R.id.searchWorkoutsSearchView);
        newWorkoutButton = findViewById(R.id.newWorkoutButton);
        filterWorkoutsButton = findViewById(R.id.filterWorkoutsButton);
        workoutsListView = findViewById(R.id.workoutsListView);

        userWorkouts = new ArrayList<>();
        // TODO get the list of workouts for the user from the database and put it into the arraylist


        // Below is test code for searching and filtering the list
//        list1 = new ArrayList<>();
//
//        list1.add("Monday");
//        list1.add("Tuesday");
//        list1.add("Wednesday");
//        list1.add("Thursday");
//        list1.add("Friday");
//        list1.add("Saturday");
//        list1.add("Sunday");

        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,userWorkouts);
        workoutsListView.setAdapter(adapter);
        workoutsSearchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                adapter.getFilter().filter(newText);
                return false;
            }
        });
        //workoutsSearchView.setOnQueryTextListener(new);

    }
    private class WorkoutsAdapter extends ArrayAdapter<String>{
        public WorkoutsAdapter(Context ctx) {
            super(ctx, 0);
        }

        public int getCount() {
            return userWorkouts.size();
        }

        // TODO update this so that you can search by something other than position?
        public String getItem(int position) {
            return userWorkouts.get(position);
        }

        public View getView(int position, View convertView, ViewGroup parent) {
            LayoutInflater inflater = WorkoutsActivity.this.getLayoutInflater();

            //This will recreate your View that you made in the resource file. If the position is an even number (position%2 == 0), then inflate chat_row_incoming, else inflate chat_row_outgoing:

            View result = null ;

            // TODO maybe only need one result statment because we are not changing the layout back and forth?
            if(position%2 == 0)
                // TODO create layout for how we want the workouts to look
                //result = inflater.inflate(R.layout.chat_row_incoming, null);

            else

                //result = inflater.inflate(R.layout.chat_row_outgoing, null);

            //From the resulting view, get the TextView which holds the string message:

            // TODO update this / maybe just remove because we are not dynamically updating these in realtime
            //TextView message = (TextView)result.findViewById(R.id.message_text);
            message.setText(getItem(position)); // get the string at position
            return result;
        }


    }
}