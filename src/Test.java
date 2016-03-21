/**
 * Created by lk on 16. 3. 22..
 */
public class Test {

    public static void main(String arg[]){
        RequestUtil request = null;

        String body = "name=강경완&email=lk@lemonlab.co.6&password=adad&phonenumber=010-0000-7&gcmtoken=fdafsd";
        request.post("http://lemonlab.co.kr/ssu/php/here/hereUser", body, new Request() {
            @Override
            public void onSuccess(String receiveData) {
                System.out.println(receiveData);
            }

            @Override
            public void onFail(String url, String error) {
                System.out.println(error);
            }
        });

        request.get("http://lemonlab.co.kr/ssu/php/here/hereUser/lk@lemonlab.co.kr", new Request() {
            @Override
            public void onSuccess(String receiveData) {
                System.out.println(receiveData);
            }

            @Override
            public void onFail(String url, String error) {

            }
        });
    }
}
