package questions;

import java.util.ArrayList;
import java.util.Objects;

/**
 * Class for multipleSelect.
 */
public class MultipleSelect implements Question {
  private final String questions;
  private final ArrayList<String> choices;
  private final String answer;

  /**
   * Constructor to initialize questions of multipleSelect.
   */
  public MultipleSelect(String questions, String answer, String... choices) {
    this.questions = questions;
    this.choices = new ArrayList<String>();
    if (choices.length < 3 || choices.length > 8) {
      throw new IllegalArgumentException();
    }
    for (int i = 0; i < choices.length - 1; i++) {
      this.choices.add(choices[i]);
    }
    String[] correctAns = answer.split(" ");
    if (correctAns.length > choices.length) {
      throw new IllegalArgumentException();
    } else {
      this.answer = answer;
    }
  }

  @Override
  public int hashCode() {
    return Objects.hash(answer, choices, questions);
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
    MultipleSelect other = (MultipleSelect) obj;
    return Objects.equals(answer, other.answer) && Objects.equals(choices, other.choices)
        && Objects.equals(questions, other.questions);
  }

  @Override
  public int compareTo(Question o) {
    if (o instanceof TrueFalse) {
      return 1;
    } else if (o instanceof MultipleChoice) {
      return 1;
    } else if (o instanceof MultipleSelect) {
      return this.questions.compareTo(o.getText());
    } else {
      return -1;
    }

  }

  @Override
  public String answer(String answer) {
    int x = 0;
    String[] ans = answer.split(" ");
    String[] cAns = this.answer.split(" ");
    if (ans.length > choices.size() || ans.length == 0 || cAns.length != ans.length) {
      return INCORRECT;

    } else {
      for (String element : ans) {
        if (!this.answer.contains(element)) {
          x = 1;
        }
      }
      if (x == 1) {
        return INCORRECT;
      } else {
        return CORRECT;
      }

    }
  }

  @Override
  public String getText() {
    return this.questions;
  }

}
