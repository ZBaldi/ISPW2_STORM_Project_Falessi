package it.zbaldi.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
public class BugFixedTicket {

    /** Unique identifier of the entity (e.g., issue, class, or record). */
    private String id;

    /** Version in which the fix was introduced or released. */
    private String fixVersion;

    /** Version(s) in which the issue or change affects the system. */
    private String affectedVersion;

    /** Version in which the issue was discovered (opening version). */
    private String openingVersion;

    /** Date when the entity was created. */
    private LocalDate creationDate;
}
