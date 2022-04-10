### Açık Kaynak vize

- Öncelikle oluşturduğumuz docker image'i indirmek için :
`$ docker pull eksiEnes/acik-kaynak-vize`

- Git üzerinden kodlarımızı oluşturduğumuz klasöre klonlamamız gerekiyor bunun için konsol komutumuz ise:

`$ git clone https://github.com/eksiEnes/acik-kaynak-vize.git`

- Kodlarımız indikten sonra yapmamız gereken indirdiğimiz image'i çalıştırmamız gerekiyor.

- Java Spring Boot projesi olduğu için Hostumuz 8080 olması gerekmektedir.

`$ docker run -dp 8080:8080 acik-kaynak-vize`

-  docker ps komutunu kullanarak çalışan imageleri görebilirsiniz.

- İnternet tarayıcımıza girdikten sonra localhost:8080/welcome çalıştırdığımızda ekranımızda String bir metin göreceğiz.



### Enes Ekşi - 170419046
