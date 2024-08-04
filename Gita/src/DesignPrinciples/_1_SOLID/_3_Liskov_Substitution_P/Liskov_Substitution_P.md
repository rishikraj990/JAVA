# SOLID
* L = Liskov’s Substitution Principle

“Derived or child classes must be substitutable for their base or parent classes”

(RISHIK)
-
matlab "must be substitutable" -> koi class ko hum force nahi ker sakte ki wo parent and child
ko follow hi kare, might be kerSAKTA hai pr KERN SuiTABLE nahi hai

Example: square(child) aur rectangle(parent) parent child ko follow KER SAKTA hai,
Pr PROBLEM ye hai ki rectangle ke pas 2 side hai pr Square ke pas 1 side,
Humlog cahe to square me bhi dono side ka value seperately mention ker sakte, but 
Ye SAHI NHAI hoga,
Esliye POSSIBILITY ke baad bhi yaha parent child ko FOLLOW NAHI ker sakte