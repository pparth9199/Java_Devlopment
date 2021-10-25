package questions;

import java.util.ArrayList;
import java.util.Objects;

/**
 * Class to implement multiple choice questions.
 */
public class MultipleChoice implements Question {
  private final String questions;

  private final String answer;

  /**
   * Constructor for multiple choice questions.
   */
  public MultipleChoice(String questions, String answer, String... choices) {
    this.questions = questions;
    final ArrayList<String> choices1;
    choices1 = new ArrayList<String>();
    for (int i = 0; i < choices.length; i++) {
      choices1.add(choices[i]);
    }
    this.answer = answer;
  }

  @Override
  public int hashCode() {
    return Objects.hash(answer, questions);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    MultipleChoice other = (MultipleChoice) obj;
    return Objects.equals(answer, other.answer) && Objects.equals(questions, other.questions);
  }

  @Override
  public int compareTo(Question o) {
    if (o instanceof TrueFalse) {
      return 1;
    } else if (o instanceof MultipleChoice) {
      return this.questions.compareTo(o.getText());
    } else if (o instanceof MultipleSelect) {
      return -1;
    } else {
      return -1;
    }
  }

  @Override
  public String answer(String answer) {
    String[] ans = answer.split(" ");
    if (ans.length > 1) {
      throw new IllegalArgumentException();
    } else if (answer == this.answer) {
      return CORRECT;
    } else {
      return INCORRECT;
    }
  }

  @Override
  public String getText() {
    return this.questions;
  }
}
