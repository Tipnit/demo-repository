
public class UserServices {
    protected final Log logger = LogFactory.getLog(this.getClass()); //used to write to the console

    public ArrayList<User> retrieveUser()
    {

        logger.info(Parse.isIsRootMode());
        final ArrayList<User> user = new ArrayList<>();

        ParseQuery<User> query = ParseQuery.getQuery(User.class);
        try {
            List<User> list = query.find();
            for (User U : list) {
                //logger.info(p.toString()); //use if you want to see your products in the console
                User.add(U);
            }
        }
        catch(Exception e)
        {
            logger.error("Error occurred", e);
        }
        logger.info(user.size());
        return user;
    }

    public User getUser(String id)
    {
        User user  = null;

        //defines the query for the product class
        ParseQuery<User> query = ParseQuery.getQuery(User.class);

        try{
            user = query.get(id); //gets a single record based on objectId
        }catch (ParseException e)
        {
            e.printStackTrace();
        }

        return user;
    }
}


