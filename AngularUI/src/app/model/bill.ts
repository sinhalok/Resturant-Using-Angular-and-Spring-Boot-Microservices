
import { Item } from "./item";

export class Bill{
    public id?:number;
	
	public  time?:string;
	public userId?:number;
	public userName?: string;
	public item: Item;

    constructor( item :Item){
        this.item=item;
    }
}