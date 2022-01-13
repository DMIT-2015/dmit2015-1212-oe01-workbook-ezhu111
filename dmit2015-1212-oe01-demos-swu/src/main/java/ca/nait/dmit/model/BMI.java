package ca.nait.dmit.model;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BMI {
    private double weight, height;

    public double bmi() {
        return 703 * weight / (height*height);
    }

    public String bmiCategory(){
        

        return "";
    }
}
