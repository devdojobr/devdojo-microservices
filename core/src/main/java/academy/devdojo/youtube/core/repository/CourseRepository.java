package academy.devdojo.youtube.core.repository;


import academy.devdojo.youtube.core.model.Course;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * @author William Suane
 */
public interface CourseRepository extends PagingAndSortingRepository<Course, Long> {
}
