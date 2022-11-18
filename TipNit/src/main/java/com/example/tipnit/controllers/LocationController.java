
public class UserController{
    private UserService userService;

    public UserController(ProductService userService) {
        this.userService = userService;
    }

    //get all
    @GetMapping("/") //sets the path to this method
    public ArrayList<UserController> getUsers() {
        ArrayList<UserController> userC = new ArrayList<>();

        //Convert the Parse Product object to a POJO Product object that can be serialized by Spring
        ArrayList<User> list = userService.retrieveUser();
        for(User u : list)
        {
            User.add(u.getUser());
        }
        return ;
    }

    //get only one based on object id
    @GetMapping("/find/{id}")
    public SerializableProduct getProductById(@PathVariable String id){
        return productService.getProductById(id).getSerializable();
    }
}
