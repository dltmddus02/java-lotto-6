package domain;

import java.util.List;


import camp.nextstep.edu.missionutils.Console;
import camp.nextstep.edu.missionutils.Randoms;

public class Lotto {
    private final List<Integer> numbers;

    public Lotto(List<Integer> numbers) {
        validate(numbers);
        this.numbers = numbers;
    }

    private void validate(List<Integer> numbers) {
        if (numbers.size() != 6) {
            throw new IllegalArgumentException();
        }
        if (numbers.stream().distinct().count() != 6){
            throw new IllegalArgumentException();
        }
    }
    // TODO: 추가 기능 구현
    public List<Integer> getLottoNumbers(){
        return numbers;
    }

}
