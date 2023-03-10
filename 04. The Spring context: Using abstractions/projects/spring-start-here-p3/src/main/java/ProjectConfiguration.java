import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import proxies.EmailCommentNotificationProxy;
import repos.DBCommentRepository;
import services.CommentService;

@Configuration
@ComponentScan(basePackageClasses = {CommentService.class, EmailCommentNotificationProxy.class, DBCommentRepository.class})
public class ProjectConfiguration {
}
