package school.lemon.java1101.collections.entity;

import java.util.Objects;

public class EntityForSet implements Comparable {

    private String text;


    public EntityForSet() {
    }

    public EntityForSet(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        EntityForSet that = (EntityForSet) o;
//        return Objects.equals(text, that.text);
//    }
//
//    @Override
//    public int hashCode() {
//
//        return text.hashCode();
//    }


    @Override
    public String toString() {
        return this.text;
    }

    @Override
    public int compareTo(Object o) {
        if (o == null){
            return -1;
        }

        EntityForSet entity = (EntityForSet) o;


        return this.text.length()-entity.getText().length();
    }
}
