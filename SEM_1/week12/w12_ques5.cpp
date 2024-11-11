#include <iostream>

class Node{
public:
    int key;
    int data;
    Node* next;

    Node(){
        key = 0;
        data = 0;
        next = NULL;
    }

    Node(int k, int d){
        key = k;
        data = d;
    }
};

class SinglyLinkedList{

public:
    Node* head;

    SinglyLinkedList(){
        head = NULL;
    }

    SinglyLinkedList(Node *n){
        head = n; //Pass by Address
    }

    //1. Checks if particular Node exists using key value.
    Node* nodeExists(int k){
        Node* temp = NULL;

        Node* ptr = head;
        while(ptr != NULL){
            if(ptr->key == k){
                temp = ptr;
            }
            ptr = ptr->next;
        }

        return temp;
    }

    //2. Append node to the list ---> append always happens at end

    void appendNode(Node *n){
        if(nodeExists(n->key)!=NULL){
            std::cout << "Node already exists with key value: " << n->key << ". Append another node with different key value." << std::endl;
        }

        else{
            if(head == NULL){
                head = n;
                std::cout << "Node Appended" << std::endl;
            }
            else{
                Node* ptr = head;
                while(ptr->next != NULL){
                    ptr = ptr->next;
                }
                ptr->next = n;
                std::cout << "Node Appended." << std::endl;
            }
        }
    }

    //3. Prepend Node - Attach a node at the start

    void prependNode(Node* n){
        if(nodeExists(n->key)!=NULL){
            std::cout << "Node already exists with key value: " << n->key << ". Append another node with different key value." << std::endl;
        }
        else{
            n->next = head;
            head = n;
            std::cout <<"Node Prepended. " <<  std::endl;
        }
    }

    //4. Insert a Node after a particular node in the list

    void insertNodeAfter(int k, Node* n){
        Node* ptr = nodeExists(k);
        if(ptr == NULL){
            std::cout << "No node exists with key value: " << k << std::endl;
        }
        else{
            if(nodeExists(n->key)!=NULL){
                std::cout << "Node already exists with key value: " << n->key << ". Append another node with different key value." << std::endl;
            }
            else{
                n->next = ptr->next;
                ptr->next = n;
                std::cout << "Node Inserted" << std::endl;
            }
        }
    }

    //5. Delete node by unique key.
    void deleteNodeByKey(int k){

        if(head == NULL){
            std::cout<< "Singly Linked List already Empty. Cannot Delete" << std::endl;
        }

        else if(head!=NULL){
            if(head->key==k){
                head = head->next;
                std::cout << "Node Unlinked with key value: " << k << std::endl;
            }
            else{
               Node* temp = NULL;
               Node* prevptr = head;
               Node* currentptr = head->next;
               while(currentptr!=NULL){
                   if(currentptr->key == k){
                       temp = currentptr;
                       currentptr = NULL;
                   }

                   else{
                       prevptr = prevptr->next;
                       currentptr = currentptr->next;
                   }
               }

               if(temp!=NULL){
                   prevptr->next = temp->next;
                   std::cout << "Node Unlinked with key value: " << k << std::endl;
               }
               else{
                   std::cout << "Node doesn't exists with key value: " << k << std::endl;
               }
            }
        }
    }

    //6. Update Node By key

    void updateNodeByKey(int k, int d){
        Node* ptr = nodeExists(k);

        if(ptr!=NULL){
            ptr->data = d;
            std::cout << "Node Data Updated Successfully" << std::endl;
        }
        else{
            std::cout << "Node doesn't exist with key value: " << k << std::endl;
        }
    }

    //7. printing linked list

    void displayList(){
        if(head==NULL){
            std::cout << "No nodes in Singly Linked List";
        }
        else{
            std::cout << std::endl << "Singly Linked List Values: ";
            Node* temp = head;

            while(temp!=NULL){
                std::cout << "(" << temp->key << "," << temp->data << ") --> ";
                temp = temp->next;
            }
        }
    }

};

int main(){

    SinglyLinkedList s;
    int option;
    int key1,k1,data1;

    do{
        std::cout<<"\nOperations that can be performed." << std::endl;
        std::cout << "1. Append Node" << std::endl;
        std::cout << "2. Prepend Node" << std::endl;
        std::cout << "3. Insert Node after a particular Node" << std::endl;
        std::cout << "4. Delete Node by key" << std::endl;
        std::cout << "5. Update Node by key" << std::endl;
        std::cout << "6. Display data" << std::endl;
        std::cout << "7. Clear Screen" << std::endl;
        std::cout << "Select option number for the operation you want to perform. Enter 0 to exit: " ;
        std::cin>>option;
        Node* n1 = new Node();

        switch(option){
            case 0:
                break;
            case 1:
                std::cout << "Append Node Operation \nEnter Key and data of the Node to be Appended: ";
                std::cin >> key1 >> data1;
                n1->key = key1;
                n1->data = data1;
                s.appendNode(n1);
                s.displayList();
                std::cout << std::endl;
                break;

            case 2:
                std::cout << "Prepend Node Operation \nEnter Key and data of the Node to be Prepended: ";
                std::cin >> key1 >> data1;
                n1->key = key1;
                n1->data = data1;
                s.prependNode(n1);
                s.displayList();
                std::cout << std::endl;
                break;

            case 3:
                std::cout << "Insert Node after Operation \nEnter Key of existing Node after which you want to insert this New Node: ";
                std::cin >> k1;
                std::cout << "Enter key and data of the new Node: ";
                std::cin >> key1 >> data1;
                n1->key = key1;
                n1->data = data1;
                s.insertNodeAfter(k1,n1);
                s.displayList();
                std::cout << std::endl;
                break;

            case 4:
                std::cout << "Delete Node By Key Operation \nEnter Key of the node to be deleted: ";
                std::cin >> k1;
                s.deleteNodeByKey(k1);
                s.displayList();
                std::cout << std::endl;
                break;

            case 5:
                std::cout << "Update Node By Key Operation \nEnter Key and New data to be updated: ";
                std::cin >> key1 >> data1;
                s.updateNodeByKey(key1, data1);
                std::cout << std::endl;
                break;

            case 6:
                s.displayList();
                std::cout << std::endl;
                break;

            case 7:
                system("cls");
                break;

            default:
                std::cout << "Wrong Input...!" << std::endl;
        }
    } while(option!=0);

    return 0;
}