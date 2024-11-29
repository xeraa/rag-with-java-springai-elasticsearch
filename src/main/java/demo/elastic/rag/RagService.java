package demo.elastic.rag;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.vectorstore.ElasticsearchVectorStore;
import org.springframework.stereotype.Service;

@Service
public class RagService {

    private final String prompt = """
        You're assisting with providing the rules of the tabletop game Runewars.
        Use the information from the DOCUMENTS section to provide accurate answers to the
        question in the QUESTION section. 
        If unsure, simply state that you don't know.
        
        DOCUMENTS:
        
        QUESTION:
        """;

    // Both beans autowired from default configuration
    private ElasticsearchVectorStore vectorStore;
    private ChatClient chatClient;

    public RagService(ElasticsearchVectorStore vectorStore, ChatClient.Builder clientBuilder) {
        this.vectorStore = vectorStore;
        this.chatClient = clientBuilder.build();
    }

    public void ingestPDF(String path) {

    }

    public String queryLLM(String question) {
        return "a";
    }
}
