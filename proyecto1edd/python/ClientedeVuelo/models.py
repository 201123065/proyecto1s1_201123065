from django.db import models

# Create your models here.
class Blopost(models.model):
	title=models.CharField(max_lenght:150)
	body=models.TextField()
	time=models.DatTimeField()