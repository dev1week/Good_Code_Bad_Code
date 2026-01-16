class TextSummarizer{

    String summarizeText(String text) {
        return splitIntoParagraphs(text)
                .filter(paragraph -> calculateImportanceScore(paragraph) > 0.5)
                .join("\n");
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


    private List<String> splitIntoParagraphs(String text) {
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