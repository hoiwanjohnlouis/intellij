package intro;

public class Ex01SimpleData {
    private int intData;
    private char characterData;

    static private StringBuffer sb;

    Ex01SimpleData() {
        this(0,' ');
    }
    Ex01SimpleData(int i, char c) {
        this.intData = i;
        this.characterData = c;
    }

    @Override
    public String toString() {
        sb = new StringBuffer();
        sb.append("intData:");
        sb.append(intData);
        sb.append("\ncharacter:");
        sb.append(characterData);
        return String.valueOf(sb);
    }
}
