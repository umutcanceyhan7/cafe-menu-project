package itemMenuSearchTree;

public class ItemMenuSearchTree {
	// Root node
		private Item root;
		
		//Constructor
		public ItemMenuSearchTree(){
			this.root = null;
		}
		public <T> void add(String itemType, String itemName, int price, T itemProperty) {
			Item<T> newItem = new Item<T>(itemType,itemName,price,itemProperty);
			// if tree is empty
			if(root == null) {
				setRoot(newItem);
			}
			else {
				
				Item tempItem = getRoot();
				Item parent;
				
				while(true) {
					parent = tempItem;
					// if key is less than parent key go left side
					if(newItem.getPrice() < tempItem.getPrice()) {
						tempItem = ((Item) tempItem).getLeft();
						
						if(tempItem == null) {
							parent.setLeft(newItem);
							return;
						}
					}
					// if key is greater than parent key go right side
					else {
						
						tempItem = tempItem.getRight();
						
						if(tempItem == null) {
							parent.setRight(newItem);
							return;
						}
					}
				}
			}
			
		}
		public <T> void inOrderTraverse(Item focusItem) {
			if(focusItem != null) {
				
				inOrderTraverse(focusItem.getLeft());
				System.out.println(focusItem.toString());
				inOrderTraverse(focusItem.getRight());

			}
		}
		public <T> void preOrderTraverse(Item focusItem) {
			if(focusItem != null) {

				System.out.println(focusItem.toString());
				preOrderTraverse(focusItem.getLeft());
				preOrderTraverse(focusItem.getRight());

			}
		}
		public <T> void postOrderTraverse(Item focusItem) {
			if(focusItem != null) {

				
				preOrderTraverse(focusItem.getLeft());
				preOrderTraverse(focusItem.getRight());
				System.out.println(focusItem.toString());

			}
		}
		
		
		public Item getRoot() {
			return root;
		}
		public void setRoot(Item newItem) {
			this.root = newItem;
		}
}
