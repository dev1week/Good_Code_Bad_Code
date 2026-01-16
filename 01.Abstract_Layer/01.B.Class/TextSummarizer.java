class TextSummarizer{
    private final ParagraphFinder paragraphFinder;
    private final TextImportanceScorer textImportanceScorer;

    String summarizeText(String text) {
        return paragraphFinder.find(text)
                .filter(paragraph ->importanceScorer.isImportant(paragraph))
                .join("\n");
    }

    public TextSummarizer(ParagraphFinder paragraphFinder, TextImportanceScorer textImportanceScorer) {
        this.paragraphFinder = paragraphFinder;
        this.textImportanceScorer = textImportanceScorer;
    }
}


class ParagraphFinder{

    private List<String> find(String text) {
        List<String> paragraphs = new ArrayList<>();

        Int start = detectParagraphStartOffset(text,0 );
        while(start != null){
            Int end = detectParagraphEndOffset(text,start);
            if(end == null){
                break;;
            }
            paragraphs.add(text.substring(start, end));
            start = detectParagraphStartOffset(text,end);
        }
        return paragraphs;
    }

    private Int detectParagraphStartOffset(String text, Int currentOffset) {
        //구현 중략 
    }

    private Int detectParagraphEndOffset(String text, Int currentOffset) {
        //구현 중략 
    }
}

class TextImportanceScorer{

    public Boolean isImportant(String text) {
        return calculateImportanceScore(text) > 0.5;
    }

    private double calculateImportanceScore(String paragraph) {
        List<String> nouns = extractNouns(paragraph);
        List<String> verbs = extractVerbs(paragraph);
        List<String> adjectives = extractAdjectives(paragraph);
        
        //구현 중략 
        
        return importanceScore;
    }

    private List<String> extractNouns(String paragraph) {
        //구현 중략 
    }

    private List<String> extractVerbs(String paragraph) {
        //구현 중략 
    }

    private List<String> extractAdjectives(String paragraph) {
        //구현 중략 
    }

}