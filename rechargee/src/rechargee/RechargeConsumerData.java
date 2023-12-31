package rechargee;

	import java.util.List;
	import java.util.function.Function;



	public class RechargeConsumerData {
		public static void rechargeData(Recharge[] rechargeObjects, Function<Recharge, String> rechargedata) {
	        for (Recharge recharge : rechargeObjects) {
	            String result = rechargedata.apply(recharge);
	            System.out.println(result);
	        }
		}

	    public static void main(String[] args) {
	        Recharge[] rechargeObjects = {
	            new Recharge(1, 50.0f, "valid"),
	            new Recharge(2, 30.0f, "invalid"),
	            
	        };

	        rechargeData(rechargeObjects, recharge -> "Customer ID: " + recharge.getCustomerId() + ", Amount Recharged: " + recharge.getAmount());
	    }
	}
