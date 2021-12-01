package wilfridlaurier.ianroberts.cp470_w8up;

import android.media.Image;

import java.util.ArrayList;

/*

    This is the Exercise Object. It has these fields:

        String exerciseName - Holds the name of the exercise

        ArrayList<SetRep> setRepConfigs - which is an arraylist of SetRep objects telling you the
        amount weight, reps, and sets

        String muscleGroupCategory - which is the defined muscle group for the exercise

        Image exerciseImage - to identify the exercise

    It has the methods:

        2 constructor methods for creating an exercise with or without an image

        Get/Set methods for all fields

        2 additional methods for adding or removing SetReps from the exercise

 */

public class Exercise {
    String exerciseName = "";
    ArrayList<SetRep> setRepConfigs = new ArrayList<>();
    String muscleGroupCategory = "";
    Image exerciseImage;

    // TODO sort out how to do images for exercises

    public Exercise(String exerciseName, SetRep setRep, String muscleGroupCategory){
        this.exerciseName = exerciseName;
        this.setRepConfigs.add(setRep);
        this.muscleGroupCategory = muscleGroupCategory;
        //this.exerciseImage =
    }
    public Exercise(String exerciseName, SetRep setRep, String muscleGroupCategory,Image exerciseImage){
        this.exerciseName = exerciseName;
        this.setRepConfigs.add(setRep);
        this.muscleGroupCategory = muscleGroupCategory;
        //this.exerciseImage = exerciseImage;
    }

    // Set methods for Exercise class

    public void setExerciseName(String exerciseName) {
        this.exerciseName = exerciseName;
    }

    public void setMuscleGroupCategory(String muscleGroupCategory) {
        this.muscleGroupCategory = muscleGroupCategory;
    }

    public void setExerciseImage(Image exerciseImage) {
        this.exerciseImage = exerciseImage;
    }

    // Get methods for Exercise class

    public String getExerciseName() {
        return exerciseName;
    }

    public ArrayList<SetRep> getSetRepConfigs() {
        return setRepConfigs;
    }

    public String getMuscleGroupCategory() {
        return muscleGroupCategory;
    }

    public Image getExerciseImage() {
        return exerciseImage;
    }

    // Additional methods

    public Boolean addSetRep(SetRep newSetRep){
        if (!this.setRepConfigs.contains(newSetRep)) {
            this.setRepConfigs.add(newSetRep);
            return true;
        }
        return false;
    }

    public Boolean removeSetRep(SetRep setRep){
        if (this.setRepConfigs.contains(setRep)) {
            this.setRepConfigs.remove(setRep);
            return true;
        }
        return false;
    }
}
