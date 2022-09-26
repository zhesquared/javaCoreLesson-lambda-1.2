package twiin;

@FunctionalInterface
public interface OnTaskDoneListener {
    void onDone(String result);
}
