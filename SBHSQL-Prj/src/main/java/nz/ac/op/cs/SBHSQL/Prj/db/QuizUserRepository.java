package nz.ac.op.cs.SBHSQL.Prj.db;


import nz.ac.op.cs.SBHSQL.Prj.models.QuizUser;
import org.springframework.data.repository.CrudRepository;

public interface QuizUserRepository  extends CrudRepository<QuizUser, String>{
}
