package oct.ex_11102024_Encapsulation.Task;

public class TestCaseAPI extends BaseTestAPI {

    TestCaseAPI() {
        super();
//        this.performHTTPMethod("POST");
        this.setName("GET", true);
        this.setRepoName("Suraj's repo", true);
        this.setId(1, true);

    }

    @Override
    public void setName(String methodName, boolean isAuth) {
        super.setName(methodName, isAuth);
    }

    @Override
    public void setRepoName(String repoName, boolean isAuth) {
        super.setRepoName(repoName, isAuth);
    }

    @Override
    public void setId(int id, boolean isAuth) {
        super.setId(id, isAuth);
    }

}
