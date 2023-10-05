import java.util.ArrayList;
import java.util.List;

public class FullJustifyString {
    public static List<String> fullJustify(String[] words, int maxWidth) {
        final List<String> result = new ArrayList<String>();

        int curLineLen = 0;
        List<String> spaceList = new ArrayList<String>();
        List<String> wordList = new ArrayList<String>();
        for(int i=0; i<words.length; i++) {
            final int wordLen = words[i].length();
            curLineLen += wordLen;
            if(curLineLen + spaceList.size() <= maxWidth) {
                wordList.add(words[i]);
                spaceList.add(" ");
                continue;
            }else {
                if(spaceList.size() >= wordList.size()) {
                    spaceList.remove(spaceList.size()-1);
                }
                curLineLen-=wordLen;
                i--;
            }
            //calc space
            int remainSpaceLen = maxWidth - curLineLen - spaceList.size();
            if(spaceList.size()>0) {
                do {
                    for(int a=0; a<spaceList.size() && remainSpaceLen > 0; a++,remainSpaceLen--) {
                        final StringBuffer sbSpace = new StringBuffer(spaceList.get(a));
                        sbSpace.append(" ");
                        spaceList.set(a, sbSpace.toString());
                    }
                }while(remainSpaceLen>0);
            }else if(remainSpaceLen>0){
                spaceList.add(String.format("%-"+remainSpaceLen+"s",""));
            }
            //print result
            final StringBuffer sb = new StringBuffer();
            for(int j=0; j<wordList.size(); j++) {
                sb.append(wordList.get(j));
                if(j <= spaceList.size() - 1) {
                    sb.append(spaceList.get(j));
                }
            }
            result.add(sb.toString());
            //new line
            wordList.clear();
            curLineLen = 0;
            spaceList.clear();
        }
        if(wordList.size() > 0) {
            final StringBuffer sb = new StringBuffer();
            for(int j=0; j<wordList.size(); j++) {
                sb.append(wordList.get(j));
                if(j <= spaceList.size() - 1) {
                    sb.append(spaceList.get(j));
                }
            }
            if(sb.length() < maxWidth) {
                result.add(String.format("%-"+maxWidth+"s",sb.toString()));
            }else if(sb.length() > maxWidth){
                result.add(sb.substring(0,maxWidth));
            }else{
                result.add(sb.toString());
            }
        }
        return result;
    }

    public static void main(String args[]){
        final String[] inputs = {"The","quick","brown","fox","jumps","over","the","lazy","dog"};
        final List<String> outputs = fullJustify(inputs,10);
        for (String output : outputs) {
            System.out.println(output);
        }
    }
}

