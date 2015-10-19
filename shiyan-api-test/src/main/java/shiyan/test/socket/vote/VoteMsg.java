package shiyan.test.socket.vote;

/**
 * Created by Administrator on 2015/10/16.
 */
public class VoteMsg {
    private boolean isInquiry;
    private boolean isResponse;
    private int candidateID;
    private long voteCount;
    public static final int MAX_CANDIDATE_ID = 1000;

    public VoteMsg(boolean isResponse, boolean isInquiry, int candidateID, long voteCount) throws IllegalArgumentException {
        if (voteCount != 0 && !isResponse) {
            throw new IllegalArgumentException("Request vote count must be zero");
        }
        if (candidateID < 0 || candidateID > MAX_CANDIDATE_ID) {
            throw new IllegalArgumentException("Bad Candidate ID: " + candidateID);
        }
        if (voteCount < 0) {
            throw new IllegalArgumentException("Total must be >= zero");
        }
        this.candidateID = candidateID;
        this.isResponse = isResponse;
        this.isInquiry = isInquiry;
        this.voteCount = voteCount;
    }

    public boolean isInquiry() {
        return isInquiry;
    }

    public void setInquiry(boolean isInquiry) {
        this.isInquiry = isInquiry;
    }

    public boolean isResponse() {
        return isResponse;
    }

    public void setResponse(boolean isResponse) {
        this.isResponse = isResponse;
    }

    public int getCandidateID() {
        return candidateID;
    }

    public void setCandidateID(int candidateID) throws IllegalArgumentException{
        if (candidateID < 0 || candidateID > MAX_CANDIDATE_ID) {
            throw new IllegalArgumentException("Bad Candidate ID: " + candidateID);
        }
        this.candidateID = candidateID;
    }

    public long getVoteCount() {
        return voteCount;
    }

    public void setVoteCount(long voteCount) {
        if ((voteCount != 0 && !isResponse) || voteCount < 0) {
             throw new IllegalArgumentException("Bad vote count");
        }
        this.voteCount = voteCount;
    }

    public String toString(){
        String res = (isInquiry ? "inquiry" : "vote") + " for candidate " + candidateID;
        if (isResponse) {
            res = "response to " + res + " who now has " + voteCount + " vote(s)";
        }
        return res;
    }

}
