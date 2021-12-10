package teammates.storage.entity;
import static teammates.common.util.FieldValidator.PARTICIPANT_TYPE_TEAM_ERROR_MESSAGE;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import com.googlecode.objectify.Key;
import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
import com.googlecode.objectify.annotation.Index;
import com.googlecode.objectify.annotation.OnSave;
import com.googlecode.objectify.annotation.Translate;
import com.googlecode.objectify.annotation.Unindex;

import teammates.common.datatransfer.FeedbackParticipantType;
import teammates.common.datatransfer.questions.FeedbackQuestionType;
import teammates.common.util.Const;
import static org.junit.Assert.*;
import org.junit.Test;

public class FeedbackQuestionTest extends BaseEntity {
    private final FeedbackQuestion fq = new FeedbackQuestion();
    @Test
    public String TestgetId()
    {
        assertEquals(ahJzfnRlYW1tYXRlcy1vYmotdjVyHQsSEEZlZWRiYWNrUXVlc3Rpb24YgICAuKihzQgM,fq.getId());
    }

}