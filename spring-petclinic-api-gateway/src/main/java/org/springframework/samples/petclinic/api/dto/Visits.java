
package org.springframework.samples.petclinic.api.dto;

import java.util.ArrayList;
import java.util.List;

//import lombok.NoArgsConstructor;
import lombok.Value;


@Value
public class Visits {

    private List<VisitDetails> items = new ArrayList<>();

}
