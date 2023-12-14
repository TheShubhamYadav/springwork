package com.jva.bean;

import com.jva.annotation.PhoneNumber;
import com.jva.groups.DemographicGroup;
import com.jva.groups.LoanInfoGroup;
import com.jva.validator.Severity;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Builder;
import lombok.Data;
import org.hibernate.validator.constraints.Range;

@Data
@Builder(builderMethodName = "of")
public class LoanApplicationForm {

    @NotBlank(message = "name is blank",groups = {DemographicGroup.class} ,payload = {Severity.CRITICAL.class})
    private String Name;

    @Range(min = 18,max = 75,message = "age should be b/w 18 to 75",groups = {DemographicGroup.class}
                                                                    ,payload = {Severity.WARN.class})
    private int age;

    @PhoneNumber(message = "Enter valid mobile no",groups = {DemographicGroup.class} ,payload =
            {Severity.CRITICAL.class})
    private String mobile;

    @Pattern(regexp = "male|female",message = "enter male or female",groups = {DemographicGroup.class}
                                    ,payload = {Severity.MINOR.class})
    private String gender;

    @Pattern(regexp = "car|personal|home",message = "enter car or personal or home",groups = {LoanInfoGroup.class}
                                            ,payload = {Severity.CRITICAL.class})
    private String loanType;

    @Range(min = 100000 ,max = 10000000,message = "amount is blank/amount should be bw 1Lakh to 1crore",groups =
            {LoanInfoGroup.class},payload = {Severity.WARN.class})
    private Double loanAmount;

    @Range(min = 1 ,max = 30,message = "tenure is blank",groups = {LoanInfoGroup.class},payload =
           {Severity.CRITICAL.class})
    private int tenure;
}
