-- ----------------------------
--  Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS "t_user";
CREATE TABLE "t_user" (
	"id" varchar primary key NOT NULL,
	"username" varchar(255) NOT NULL ,
	"password" varchar(255) NOT NULL ,
	"name" varchar(255) NOT NULL,
	"user_guid" varchar(255) ,
	"status" varchar(255) default '1',
	"avatar_url" varchar(255) ,
	"last_sign_in_at" timestamp(6) WITH TIME ZONE,
	"dept_info" jsonb,
	"created_at" timestamp(6) WITH TIME ZONE NOT NULL,
	"updated_at" timestamp(6) WITH TIME ZONE,
	"role_ids" int4[],
	"menu_ids" varchar[]
)

-- ----------------------------
--  Table structure for t_role
-- ----------------------------
DROP TABLE IF EXISTS "t_role";
CREATE TABLE "t_role" (
	"id" varchar primary key NOT NULL,
	"role_name" varchar(255) NOT NULL ,
	"created_at" timestamp(6) WITH TIME ZONE NOT NULL,
	"updated_at" timestamp(6) WITH TIME ZONE ,
	"menu_ids" varchar[]
)

-- ----------------------------
--  Table structure for t_menu
-- ----------------------------
DROP TABLE IF EXISTS "t_menu";
CREATE TABLE "t_menu" (
	"id" varchar primary key NOT NULL,
	"menu_name" varchar(255) NOT NULL ,
	"created_at" timestamp(6) WITH TIME ZONE NOT NULL,
	"updated_at" timestamp(6) WITH TIME ZONE ,
	"status" smallint default '1'
)
