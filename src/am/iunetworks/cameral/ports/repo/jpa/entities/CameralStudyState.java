package am.iunetworks.cameral.ports.repo.jpa.entities;

import java.util.List;

public class CameralStudyState {

    private Long cameralID;
    private String tin;
    private Long cameralStudyStatus;
    private Long objRate;
    private Long adjRate;
    private Double deviationP;
    private Double deviationA;
    private String deviationNote;
    private String stateNote;

    private CameralAttachedDoc cameralAttachedDoc;
    private CameralLogBook cameralLogBook;

    private List<CameralStateDoc> cameralStateDocList;
    private List<History> historyList;

}
