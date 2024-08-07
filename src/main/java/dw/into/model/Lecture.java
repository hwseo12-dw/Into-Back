package dw.into.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "lecture")
public class Lecture {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long lectureId;

    @ManyToOne
    @JoinColumn(name = "teacher_id")
    private Teacher teacher;

    @ManyToOne
    @JoinColumn
    private StoreItem storeItem;

    @Column(name = "lecture_name")
    private String lectureName;

    @Column(name = "lecture_image")
    private String lectureImage;

    @Column
    private String subject;

    @Column
    private int LecPrice;

    /*@Column(name = "lecture_course")
    private String lectureCourse;

    @Column
    private String thumbnailImg;

    @Column
    private String lectureClass;*/
}
