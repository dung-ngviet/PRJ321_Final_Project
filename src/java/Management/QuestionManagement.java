/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Management;

import DAO.QuestionDAO;
import DAO.SurveyDAO;
import Entity.Answer;
import Entity.Question;
import java.util.List;

/**
 *
 * @author bactv
 */
public class QuestionManagement {
    public static boolean insertQuestion(Question question){
        return QuestionDAO.insertQuestion(question);
    }
    public static List<Question> getQuestion(int surveyID){
        return QuestionDAO.getQuestion(surveyID);
    } 

    public static List<Question> getQuestionsBySurvey(int surveyID) {
        return QuestionDAO.getQuestionsBySurvey(surveyID);
    }

}
